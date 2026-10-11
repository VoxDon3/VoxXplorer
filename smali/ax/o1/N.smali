.class public final synthetic Lax/o1/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/P0/v;

.field public final synthetic d0:Lax/Y0/c;

.field public final synthetic q:Lax/o1/P$a;


# direct methods
.method public synthetic constructor <init>(Lax/o1/P$a;Lax/P0/v;Lax/Y0/c;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/o1/N;->q:Lax/o1/P$a;

    iput-object p2, p0, Lax/o1/N;->c0:Lax/P0/v;

    iput-object p3, p0, Lax/o1/N;->d0:Lax/Y0/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o1/N;->q:Lax/o1/P$a;

    iget-object v1, p0, Lax/o1/N;->c0:Lax/P0/v;

    iget-object v2, p0, Lax/o1/N;->d0:Lax/Y0/c;

    invoke-static {v0, v1, v2}, Lax/o1/P$a;->h(Lax/o1/P$a;Lax/P0/v;Lax/Y0/c;)V

    return-void
.end method
