.class public final synthetic Lax/o1/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/Y0/b;

.field public final synthetic q:Lax/o1/P$a;


# direct methods
.method public synthetic constructor <init>(Lax/o1/P$a;Lax/Y0/b;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/o1/M;->q:Lax/o1/P$a;

    iput-object p2, p0, Lax/o1/M;->c0:Lax/Y0/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/M;->q:Lax/o1/P$a;

    iget-object v1, p0, Lax/o1/M;->c0:Lax/Y0/b;

    invoke-static {v0, v1}, Lax/o1/P$a;->e(Lax/o1/P$a;Lax/Y0/b;)V

    return-void
.end method
