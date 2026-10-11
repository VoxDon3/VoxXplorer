.class public final synthetic Lax/a1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Z

.field public final synthetic q:Lax/a1/z$a;


# direct methods
.method public synthetic constructor <init>(Lax/a1/z$a;Z)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a1/n;->q:Lax/a1/z$a;

    iput-boolean p2, p0, Lax/a1/n;->c0:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/n;->q:Lax/a1/z$a;

    iget-boolean v1, p0, Lax/a1/n;->c0:Z

    invoke-static {v0, v1}, Lax/a1/z$a;->a(Lax/a1/z$a;Z)V

    return-void
.end method
